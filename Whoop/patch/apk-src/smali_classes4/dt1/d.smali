.class public final Ldt1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ldt1/e;",
        "Ldt1/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Ldt1/d;",
        "Lod1/g;",
        "Ldt1/e;",
        "Ldt1/g;",
        "Ldt1/h;",
        "networkInteractor",
        "Ldt1/j;",
        "localInteractor",
        "<init>",
        "(Ldt1/h;Ldt1/j;)V",
        "upstream",
        "Lec3/l;",
        "d",
        "(Ldt1/g;)Lec3/l;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ldt1/h;",
        "b",
        "Ldt1/j;",
        "labrador_release"
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
.field private final a:Ldt1/h;

.field private final b:Ldt1/j;


# direct methods
.method public constructor <init>(Ldt1/h;Ldt1/j;)V
    .locals 1

    const-string v0, "networkInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldt1/d;->a:Ldt1/h;

    iput-object p2, p0, Ldt1/d;->b:Ldt1/j;

    return-void
.end method

.method public static final synthetic c(Ldt1/d;Ldt1/g;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ldt1/d;->d(Ldt1/g;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ldt1/g;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/g;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Ldt1/d;->b:Ldt1/j;

    invoke-virtual {v0, p1}, Ldt1/j;->e(Ldt1/g;)Lec3/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldt1/d;->a:Ldt1/h;

    invoke-virtual {v0, p1}, Ldt1/h;->y(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Ldt1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ldt1/d$a;-><init>(Lq83/d;Ldt1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
