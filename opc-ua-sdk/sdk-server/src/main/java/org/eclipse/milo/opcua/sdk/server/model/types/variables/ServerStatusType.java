package org.eclipse.milo.opcua.sdk.server.model.types.variables;

import org.eclipse.milo.opcua.stack.core.types.builtin.DateTime;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.ServerState;
import org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo;

public interface ServerStatusType extends BaseDataVariableType {
    BaseDataVariableType getStartTimeNode();

    DateTime getStartTime();

    void setStartTime(DateTime value);

    BaseDataVariableType getCurrentTimeNode();

    DateTime getCurrentTime();

    void setCurrentTime(DateTime value);

    BaseDataVariableType getStateNode();

    ServerState getState();

    void setState(ServerState value);

    BuildInfoType getBuildInfoNode();

    BuildInfo getBuildInfo();

    void setBuildInfo(BuildInfo value);

    BaseDataVariableType getSecondsTillShutdownNode();

    UInteger getSecondsTillShutdown();

    void setSecondsTillShutdown(UInteger value);

    BaseDataVariableType getShutdownReasonNode();

    LocalizedText getShutdownReason();

    void setShutdownReason(LocalizedText value);
}
