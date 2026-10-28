package io.sentry.protocol;

import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Map;
import p581we.C37199o;

/* JADX INFO: loaded from: classes5.dex */
public final class DebugImage implements InterfaceC20348h2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.uuid != null) {
            c37199o.m119207K("uuid");
            c37199o.m119222b0(this.uuid);
        }
        if (this.type != null) {
            c37199o.m119207K("type");
            c37199o.m119222b0(this.type);
        }
        if (this.debugId != null) {
            c37199o.m119207K("debug_id");
            c37199o.m119222b0(this.debugId);
        }
        if (this.debugFile != null) {
            c37199o.m119207K("debug_file");
            c37199o.m119222b0(this.debugFile);
        }
        if (this.codeId != null) {
            c37199o.m119207K("code_id");
            c37199o.m119222b0(this.codeId);
        }
        if (this.codeFile != null) {
            c37199o.m119207K("code_file");
            c37199o.m119222b0(this.codeFile);
        }
        if (this.imageAddr != null) {
            c37199o.m119207K("image_addr");
            c37199o.m119222b0(this.imageAddr);
        }
        if (this.imageSize != null) {
            c37199o.m119207K("image_size");
            c37199o.m119221a0(this.imageSize);
        }
        if (this.arch != null) {
            c37199o.m119207K("arch");
            c37199o.m119222b0(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                c37199o.m119207K(str);
                c37199o.m119219Y(interfaceC20602v0, obj);
            }
        }
        c37199o.m119200C();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l7) {
        this.imageSize = l7;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j7) {
        this.imageSize = Long.valueOf(j7);
    }
}
