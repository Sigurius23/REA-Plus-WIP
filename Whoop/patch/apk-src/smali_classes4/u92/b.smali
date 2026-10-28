.class public final Lu92/b;
.super Lu92/d;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR$\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lu92/b;",
        "Lu92/d;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Ll83/a0;",
        "y",
        "()V",
        "",
        "value",
        "A",
        "(Z)V",
        "",
        "getForceQuitTimeStamp",
        "()J",
        "z",
        "(J)V",
        "forceQuitTimeStamp",
        "core_release"
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
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainPreferences"

    invoke-direct {p0, p1, v0}, Lu92/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A(Z)V
    .locals 1

    const-string v0, "wasLastForceQuit"

    invoke-virtual {p0, v0, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public final y()V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "forceQuitCount"

    invoke-virtual {p0, v1, v0}, Lu92/d;->h(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v1, v0}, Lu92/d;->t(Ljava/lang/String;I)V

    return-void
.end method

.method public final z(J)V
    .locals 1

    const-string v0, "forceQuitTimeMillis"

    invoke-virtual {p0, v0, p1, p2}, Lu92/d;->u(Ljava/lang/String;J)V

    return-void
.end method
