.class public final Lvp0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvp0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\n\u001a\u00020\u00082 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00080\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR$\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8\u0006@BX\u0086.\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lvp0/a$a;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function3;",
        "",
        "",
        "",
        "Ll83/a0;",
        "logAction",
        "c",
        "(Lkotlin/jvm/functions/Function3;)V",
        "tag",
        "Lvp0/a;",
        "a",
        "(Ljava/lang/String;)Lvp0/a;",
        "<set-?>",
        "b",
        "Lvp0/a;",
        "()Lvp0/a;",
        "logger",
        "commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic a:Lvp0/a$a;

.field private static b:Lvp0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvp0/a$a;

    invoke-direct {v0}, Lvp0/a$a;-><init>()V

    sput-object v0, Lvp0/a$a;->a:Lvp0/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lvp0/a;
    .locals 2

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvp0/b;

    invoke-virtual {p0}, Lvp0/a$a;->b()Lvp0/a;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lvp0/b;-><init>(Lvp0/a;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()Lvp0/a;
    .locals 1

    sget-object v0, Lvp0/a$a;->b:Lvp0/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "logger"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final c(Lkotlin/jvm/functions/Function3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            ")V"
        }
    .end annotation

    const-string v0, "logAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvp0/a$a$a;

    invoke-direct {v0, p1}, Lvp0/a$a$a;-><init>(Lkotlin/jvm/functions/Function3;)V

    sput-object v0, Lvp0/a$a;->b:Lvp0/a;

    return-void
.end method
