## Task: Override the polling intervals by inserting a custom mender.conf

Custom mender.conf was added using a mender-client.bbappend file.

Athough task specifed it's necessary to change interval variables using the recipe instead of Mender Yocto variables -
it was also necessary to clear those variables because they take precedence over settings defined in mender.conf

```
MENDER_INVENTORY_POLL_INTERVAL_SECONDS = ""
MENDER_RETRY_POLL_INTERVAL_SECONDS = ""
MENDER_UPDATE_POLL_INTERVAL_SECONDS = ""
```

These variables were cleared in ce-linux.conf
