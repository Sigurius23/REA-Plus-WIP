.class public final Lcom/whoop/share/model/ShareBackground$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/share/model/ShareBackground;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000c\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/share/model/ShareBackground$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/share/model/RadialGradientStyle;",
        "style",
        "Lcom/whoop/share/model/ShareBackground;",
        "radialGradient",
        "(Lcom/whoop/share/model/RadialGradientStyle;)Lcom/whoop/share/model/ShareBackground;",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
        "none",
        "Lcom/whoop/share/model/ShareBackground;",
        "getNone",
        "()Lcom/whoop/share/model/ShareBackground;",
        "share_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/share/model/ShareBackground$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getNone()Lcom/whoop/share/model/ShareBackground;
    .locals 1

    invoke-static {}, Lcom/whoop/share/model/ShareBackground;->access$getNone$cp()Lcom/whoop/share/model/ShareBackground;

    move-result-object v0

    return-object v0
.end method

.method public final radialGradient(Lcom/whoop/share/model/RadialGradientStyle;)Lcom/whoop/share/model/ShareBackground;
    .locals 7

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/share/model/ShareBackground;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "RADIAL_GRADIENT"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/share/model/ShareBackground;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/share/model/ShareBackground$$serializer;->INSTANCE:Lcom/whoop/share/model/ShareBackground$$serializer;

    return-object v0
.end method
