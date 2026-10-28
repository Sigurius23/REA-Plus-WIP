.class public final Ltd1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltd1/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Ltd1/g;",
        "",
        "Ltd1/b;",
        "whoopStrapProxy",
        "Lq92/h;",
        "whoopStrapSharedPrefs",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ltd1/b;Lq92/h;Lbc3/c0;)V",
        "Lec3/l;",
        "Ltd1/f;",
        "a",
        "Lec3/l;",
        "()Lec3/l;",
        "whoopStrapStatusFlow",
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


# instance fields
.field private final a:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltd1/b;Lq92/h;Lbc3/c0;)V
    .locals 3

    const-string v0, "whoopStrapProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapSharedPrefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ltd1/b;->r()Lec3/l;

    move-result-object p1

    new-instance v0, Ltd1/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2}, Ltd1/g$b;-><init>(Lec3/l;Lq83/d;Lq92/h;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    sget-object p2, Ltd1/f;->NA:Ltd1/f;

    new-instance v0, Ltd1/g$d;

    invoke-direct {v0, v1}, Ltd1/g$d;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, p2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Ltd1/g$c;

    invoke-direct {p1, v2, v1}, Ltd1/g$c;-><init>(Lec3/l;Lq83/d;)V

    new-instance p2, Lec3/s1;

    invoke-direct {p2, p1}, Lec3/s1;-><init>(Lc93/m;)V

    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Ltd1/g;->a:Lec3/l;

    return-void
.end method


# virtual methods
.method public final a()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Ltd1/g;->a:Lec3/l;

    return-object v0
.end method
