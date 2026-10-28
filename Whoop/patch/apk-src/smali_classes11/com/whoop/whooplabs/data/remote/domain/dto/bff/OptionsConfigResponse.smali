.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0002NMB7\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBG\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J \u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015JD\u0010\u0017\u001a\u00020\u00002\u0018\u0008\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0018\u0008\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\'\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001\u00a2\u0006\u0004\u0008\'\u0010(R\'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008+\u0010\u0015R\'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010*\u001a\u0004\u0008,\u0010\u0015R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u001d\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010/R\u001d\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010/R\u001d\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u00085\u0010/R\u001d\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u00087\u0010/R\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u00089\u0010/R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010/R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010/R\u001d\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010/R\u001d\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010/R\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010/R\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010/R#\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020H0G0-8F\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010/R\u001d\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010/\u00a8\u0006O"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;",
        "",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOptionResponse;",
        "bottomSheetOptions",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigString;",
        "configStrings",
        "<init>",
        "(Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "action",
        "get",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;",
        "component1",
        "()Ljava/util/Map;",
        "component2",
        "copy",
        "(Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/Map;",
        "getBottomSheetOptions",
        "getConfigStrings",
        "Lkotlin/Function1;",
        "getTitle",
        "()Lkotlin/jvm/functions/Function1;",
        "title",
        "getBody",
        "body",
        "getPositiveCta",
        "positiveCta",
        "getNegativeCta",
        "negativeCta",
        "getErrorTitle",
        "errorTitle",
        "getErrorBody",
        "errorBody",
        "getErrorPositiveCta",
        "errorPositiveCta",
        "getErrorNegativeCta",
        "errorNegativeCta",
        "getCancelScreenTitle",
        "cancelScreenTitle",
        "getCancelScreenSubtitle",
        "cancelScreenSubtitle",
        "getCancelScreenBottomText",
        "cancelScreenBottomText",
        "getCancelScreenCtaText",
        "cancelScreenCtaText",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenOptionResponse;",
        "getCancelScreenOptions",
        "cancelScreenOptions",
        "getCancelScreenBackText",
        "cancelScreenBackText",
        "Companion",
        "$serializer",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$Companion;


# instance fields
.field private final bottomSheetOptions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final configStrings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->$stable:I

    sget-object v1, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldx2/a;

    invoke-direct {v2, v0}, Ldx2/a;-><init>(I)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-instance v2, Ldx2/a;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Ldx2/a;-><init>(I)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;

    invoke-virtual {p4}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "bottomSheetOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configStrings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;->serializer()Lwc3/c;

    move-result-object v1

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;->serializer()Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final _get_body_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getBody()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_cancelScreenBackText_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getCancelScreen()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;->getBackText()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_cancelScreenBottomText_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getCancelScreen()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;->getBottomText()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_cancelScreenCtaText_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getCancelScreen()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;->getCtaText()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_cancelScreenOptions_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/util/List;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getCancelScreen()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;->getOptions()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_1
    return-object p0
.end method

.method private static final _get_cancelScreenSubtitle_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getCancelScreen()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;->getSubtitle()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_cancelScreenTitle_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getCancelScreen()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;->getTitle()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_errorBody_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getErrorBody()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_errorNegativeCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getErrorNegativeCta()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_errorPositiveCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getErrorPositiveCta()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_errorTitle_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getErrorTitle()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_negativeCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getNegativeCta()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_positiveCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getPositiveCta()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final _get_title_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;->getTitle()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_errorNegativeCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_body_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_cancelScreenCtaText_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->copy(Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_cancelScreenBottomText_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_cancelScreenTitle_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_errorTitle_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_positiveCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_cancelScreenOptions_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_errorBody_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_negativeCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_title_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_cancelScreenSubtitle_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_errorPositiveCta_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_get_cancelScreenBackText_$lambda$0(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;",
            ">;)",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;"
        }
    .end annotation

    const-string v0, "bottomSheetOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configStrings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    invoke-direct {v0, p1, p2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final get(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;

    return-object p1
.end method

.method public final getBody()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getBottomSheetOptions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    return-object v0
.end method

.method public final getCancelScreenBackText()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getCancelScreenBottomText()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getCancelScreenCtaText()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getCancelScreenOptions()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getCancelScreenSubtitle()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getCancelScreenTitle()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getConfigStrings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    return-object v0
.end method

.method public final getErrorBody()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getErrorNegativeCta()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getErrorPositiveCta()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getErrorTitle()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getNegativeCta()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getPositiveCta()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public final getTitle()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Ldx2/b;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, Ldx2/b;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;I)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->bottomSheetOptions:Ljava/util/Map;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;->configStrings:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OptionsConfigResponse(bottomSheetOptions="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", configStrings="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
