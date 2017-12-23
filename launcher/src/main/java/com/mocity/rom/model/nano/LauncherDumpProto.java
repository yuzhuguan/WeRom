package com.mocity.rom.model.nano;

@SuppressWarnings("hiding")
public interface LauncherDumpProto {

    // enum ItemType
    public interface ItemType {
        public static final int UNKNOWN_ITEMTYPE = 0;
        public static final int APP_ICON = 1;
        public static final int WIDGET = 2;
        public static final int SHORTCUT = 3;
    }

    // enum ContainerType
    public interface ContainerType {
        public static final int UNKNOWN_CONTAINERTYPE = 0;
        public static final int WORKSPACE = 1;
        public static final int HOTSEAT = 2;
        public static final int FOLDER = 3;
    }

    // enum UserType
    public interface UserType {
        public static final int DEFAULT = 0;
        public static final int WORK = 1;
    }

    public static final class DumpTarget extends
            com.google.protobuf.nano.MessageNano {

        // enum Type
        public interface Type {
            public static final int NONE = 0;
            public static final int ITEM = 1;
            public static final int CONTAINER = 2;
        }

        private static volatile com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget[] _emptyArray;
        public static com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget[] emptyArray() {
            // Lazily initializes the empty array
            if (_emptyArray == null) {
                synchronized (
                        com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget[0];
                    }
                }
            }
            return _emptyArray;
        }

        // optional .model.DumpTarget.Type type = 1;
        public int type;

        // optional int32 page_id = 2;
        public int pageId;

        // optional int32 grid_x = 3;
        public int gridX;

        // optional int32 grid_y = 4;
        public int gridY;

        // optional .model.ContainerType container_type = 5;
        public int containerType;

        // optional .model.ItemType item_type = 6;
        public int itemType;

        // optional string package_name = 7;
        public java.lang.String packageName;

        // optional string component = 8;
        public java.lang.String component;

        // optional string item_id = 9;
        public java.lang.String itemId;

        // optional int32 span_x = 10 [default = 1];
        public int spanX;

        // optional int32 span_y = 11 [default = 1];
        public int spanY;

        // optional .model.UserType user_type = 12;
        public int userType;

        public DumpTarget() {
            clear();
        }

        public com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget clear() {
            type = com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget.Type.NONE;
            pageId = 0;
            gridX = 0;
            gridY = 0;
            containerType = com.mocity.rom.model.nano.LauncherDumpProto.ContainerType.UNKNOWN_CONTAINERTYPE;
            itemType = com.mocity.rom.model.nano.LauncherDumpProto.ItemType.UNKNOWN_ITEMTYPE;
            packageName = "";
            component = "";
            itemId = "";
            spanX = 1;
            spanY = 1;
            userType = com.mocity.rom.model.nano.LauncherDumpProto.UserType.DEFAULT;
            cachedSize = -1;
            return this;
        }

        @Override
        public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
                throws java.io.IOException {
            if (this.type != com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget.Type.NONE) {
                output.writeInt32(1, this.type);
            }
            if (this.pageId != 0) {
                output.writeInt32(2, this.pageId);
            }
            if (this.gridX != 0) {
                output.writeInt32(3, this.gridX);
            }
            if (this.gridY != 0) {
                output.writeInt32(4, this.gridY);
            }
            if (this.containerType != com.mocity.rom.model.nano.LauncherDumpProto.ContainerType.UNKNOWN_CONTAINERTYPE) {
                output.writeInt32(5, this.containerType);
            }
            if (this.itemType != com.mocity.rom.model.nano.LauncherDumpProto.ItemType.UNKNOWN_ITEMTYPE) {
                output.writeInt32(6, this.itemType);
            }
            if (!this.packageName.equals("")) {
                output.writeString(7, this.packageName);
            }
            if (!this.component.equals("")) {
                output.writeString(8, this.component);
            }
            if (!this.itemId.equals("")) {
                output.writeString(9, this.itemId);
            }
            if (this.spanX != 1) {
                output.writeInt32(10, this.spanX);
            }
            if (this.spanY != 1) {
                output.writeInt32(11, this.spanY);
            }
            if (this.userType != com.mocity.rom.model.nano.LauncherDumpProto.UserType.DEFAULT) {
                output.writeInt32(12, this.userType);
            }
            super.writeTo(output);
        }

        @Override
        protected int computeSerializedSize() {
            int size = super.computeSerializedSize();
            if (this.type != com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget.Type.NONE) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(1, this.type);
            }
            if (this.pageId != 0) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(2, this.pageId);
            }
            if (this.gridX != 0) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(3, this.gridX);
            }
            if (this.gridY != 0) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(4, this.gridY);
            }
            if (this.containerType != com.mocity.rom.model.nano.LauncherDumpProto.ContainerType.UNKNOWN_CONTAINERTYPE) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(5, this.containerType);
            }
            if (this.itemType != com.mocity.rom.model.nano.LauncherDumpProto.ItemType.UNKNOWN_ITEMTYPE) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(6, this.itemType);
            }
            if (!this.packageName.equals("")) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeStringSize(7, this.packageName);
            }
            if (!this.component.equals("")) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeStringSize(8, this.component);
            }
            if (!this.itemId.equals("")) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeStringSize(9, this.itemId);
            }
            if (this.spanX != 1) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(10, this.spanX);
            }
            if (this.spanY != 1) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(11, this.spanY);
            }
            if (this.userType != com.mocity.rom.model.nano.LauncherDumpProto.UserType.DEFAULT) {
                size += com.google.protobuf.nano.CodedOutputByteBufferNano
                        .computeInt32Size(12, this.userType);
            }
            return size;
        }

        @Override
        public com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget mergeFrom(
                com.google.protobuf.nano.CodedInputByteBufferNano input)
                throws java.io.IOException {
            while (true) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        return this;
                    default: {
                        if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
                            return this;
                        }
                        break;
                    }
                    case 8: {
                        int value = input.readInt32();
                        switch (value) {
                            case com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget.Type.NONE:
                            case com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget.Type.ITEM:
                            case com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget.Type.CONTAINER:
                                this.type = value;
                                break;
                        }
                        break;
                    }
                    case 16: {
                        this.pageId = input.readInt32();
                        break;
                    }
                    case 24: {
                        this.gridX = input.readInt32();
                        break;
                    }
                    case 32: {
                        this.gridY = input.readInt32();
                        break;
                    }
                    case 40: {
                        int value = input.readInt32();
                        switch (value) {
                            case com.mocity.rom.model.nano.LauncherDumpProto.ContainerType.UNKNOWN_CONTAINERTYPE:
                            case com.mocity.rom.model.nano.LauncherDumpProto.ContainerType.WORKSPACE:
                            case com.mocity.rom.model.nano.LauncherDumpProto.ContainerType.HOTSEAT:
                            case com.mocity.rom.model.nano.LauncherDumpProto.ContainerType.FOLDER:
                                this.containerType = value;
                                break;
                        }
                        break;
                    }
                    case 48: {
                        int value = input.readInt32();
                        switch (value) {
                            case com.mocity.rom.model.nano.LauncherDumpProto.ItemType.UNKNOWN_ITEMTYPE:
                            case com.mocity.rom.model.nano.LauncherDumpProto.ItemType.APP_ICON:
                            case com.mocity.rom.model.nano.LauncherDumpProto.ItemType.WIDGET:
                            case com.mocity.rom.model.nano.LauncherDumpProto.ItemType.SHORTCUT:
                                this.itemType = value;
                                break;
                        }
                        break;
                    }
                    case 58: {
                        this.packageName = input.readString();
                        break;
                    }
                    case 66: {
                        this.component = input.readString();
                        break;
                    }
                    case 74: {
                        this.itemId = input.readString();
                        break;
                    }
                    case 80: {
                        this.spanX = input.readInt32();
                        break;
                    }
                    case 88: {
                        this.spanY = input.readInt32();
                        break;
                    }
                    case 96: {
                        int value = input.readInt32();
                        switch (value) {
                            case com.mocity.rom.model.nano.LauncherDumpProto.UserType.DEFAULT:
                            case com.mocity.rom.model.nano.LauncherDumpProto.UserType.WORK:
                                this.userType = value;
                                break;
                        }
                        break;
                    }
                }
            }
        }

        public static com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget parseFrom(byte[] data)
                throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
            return com.google.protobuf.nano.MessageNano.mergeFrom(new com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget(), data);
        }

        public static com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget parseFrom(
                com.google.protobuf.nano.CodedInputByteBufferNano input)
                throws java.io.IOException {
            return new com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget().mergeFrom(input);
        }
    }

    public static final class LauncherImpression extends
            com.google.protobuf.nano.MessageNano {

        private static volatile com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression[] _emptyArray;
        public static com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression[] emptyArray() {
            // Lazily initializes the empty array
            if (_emptyArray == null) {
                synchronized (
                        com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression[0];
                    }
                }
            }
            return _emptyArray;
        }

        // repeated .model.DumpTarget targets = 1;
        public com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget[] targets;

        public LauncherImpression() {
            clear();
        }

        public com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression clear() {
            targets = com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget.emptyArray();
            cachedSize = -1;
            return this;
        }

        @Override
        public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
                throws java.io.IOException {
            if (this.targets != null && this.targets.length > 0) {
                for (int i = 0; i < this.targets.length; i++) {
                    com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget element = this.targets[i];
                    if (element != null) {
                        output.writeMessage(1, element);
                    }
                }
            }
            super.writeTo(output);
        }

        @Override
        protected int computeSerializedSize() {
            int size = super.computeSerializedSize();
            if (this.targets != null && this.targets.length > 0) {
                for (int i = 0; i < this.targets.length; i++) {
                    com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget element = this.targets[i];
                    if (element != null) {
                        size += com.google.protobuf.nano.CodedOutputByteBufferNano
                                .computeMessageSize(1, element);
                    }
                }
            }
            return size;
        }

        @Override
        public com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression mergeFrom(
                com.google.protobuf.nano.CodedInputByteBufferNano input)
                throws java.io.IOException {
            while (true) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        return this;
                    default: {
                        if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
                            return this;
                        }
                        break;
                    }
                    case 10: {
                        int arrayLength = com.google.protobuf.nano.WireFormatNano
                                .getRepeatedFieldArrayLength(input, 10);
                        int i = this.targets == null ? 0 : this.targets.length;
                        com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget[] newArray =
                                new com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget[i + arrayLength];
                        if (i != 0) {
                            java.lang.System.arraycopy(this.targets, 0, newArray, 0, i);
                        }
                        for (; i < newArray.length - 1; i++) {
                            newArray[i] = new com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget();
                            input.readMessage(newArray[i]);
                            input.readTag();
                        }
                        // Last one without readTag.
                        newArray[i] = new com.mocity.rom.model.nano.LauncherDumpProto.DumpTarget();
                        input.readMessage(newArray[i]);
                        this.targets = newArray;
                        break;
                    }
                }
            }
        }

        public static com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression parseFrom(byte[] data)
                throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
            return com.google.protobuf.nano.MessageNano.mergeFrom(new com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression(), data);
        }

        public static com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression parseFrom(
                com.google.protobuf.nano.CodedInputByteBufferNano input)
                throws java.io.IOException {
            return new com.mocity.rom.model.nano.LauncherDumpProto.LauncherImpression().mergeFrom(input);
        }
    }
}
