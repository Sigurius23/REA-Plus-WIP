.class public final Lm92/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm92/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lm92/b$a;",
        "",
        "<init>",
        "()V",
        "",
        "channelId",
        "",
        "channelNameResId",
        "Lc12/d;",
        "a",
        "(Ljava/lang/String;I)Lc12/d;",
        "app_prodStandardRelease"
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
    invoke-direct {p0}, Lm92/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;I)Lc12/d;
    .locals 2

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->URGENT:Lc12/b;

    invoke-direct {v0, v1, p1, p2}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lc12/d;->l(Z)Lc12/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc12/d;->j(Z)Lc12/d;

    move-result-object p1

    const-string p2, "setLightsEnabled(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
