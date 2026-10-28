.class public final Lpx2/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpx2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J9\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lpx2/a$c;",
        "",
        "<init>",
        "()V",
        "",
        "type",
        "",
        "icon",
        "title",
        "subtitle",
        "Lpx2/a;",
        "a",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lpx2/a;",
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
    invoke-direct {p0}, Lpx2/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lpx2/a;
    .locals 7

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpx2/d;->Companion:Lpx2/d$g;

    invoke-virtual {v0, p1}, Lpx2/d$g;->a(Ljava/lang/String;)Lpx2/d;

    move-result-object p1

    if-nez p4, :cond_1

    new-instance p4, Lpx2/a$b;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1}, Lpx2/d;->getIconColor()Ly81/e;

    move-result-object v0

    invoke-virtual {p1}, Lpx2/d;->getIconBackgroundColor()Ly81/e;

    move-result-object p1

    invoke-direct {p4, p2, p3, v0, p1}, Lpx2/a$b;-><init>(ILjava/lang/String;Ly81/e;Ly81/e;)V

    return-object p4

    :cond_1
    new-instance v1, Lpx2/a$a;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lpx2/d;->getIconColor()Ly81/e;

    move-result-object v4

    invoke-virtual {p1}, Lpx2/d;->getIconBackgroundColor()Ly81/e;

    move-result-object v5

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lpx2/a$a;-><init>(ILjava/lang/String;Ly81/e;Ly81/e;Ljava/lang/String;)V

    return-object v1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
