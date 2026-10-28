.class public abstract Lpx2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpx2/j$a;,
        Lpx2/j$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0002\u000e\u0012B9\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0014\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0012\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u001c\u001a\u0004\u0008\u000e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001fR\u0014\u0010!\u001a\u00020\u001e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u001f\u0082\u0001\u0002\"#\u00a8\u0006$"
    }
    d2 = {
        "Lpx2/j;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "text",
        "Lgz0/m0;",
        "icon",
        "Lpx2/i;",
        "ctaViewState",
        "Llx2/a;",
        "ctaEvent",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lpx2/i;Llx2/a;)V",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "h",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "f",
        "c",
        "g",
        "d",
        "Lgz0/m0;",
        "()Lgz0/m0;",
        "e",
        "Lpx2/i;",
        "()Lpx2/i;",
        "Llx2/a;",
        "()Llx2/a;",
        "Ly81/e;",
        "()Ly81/e;",
        "statusTextColor",
        "statusBackgroundColor",
        "Lpx2/j$a;",
        "Lpx2/j$b;",
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


# static fields
.field public static final g:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lgz0/m0;

.field private final e:Lpx2/i;

.field private final f:Llx2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lpx2/j;->g:I

    return-void
.end method

.method private constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lpx2/i;Llx2/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lpx2/j;->a:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lpx2/j;->b:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lpx2/j;->c:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lpx2/j;->d:Lgz0/m0;

    .line 7
    iput-object p5, p0, Lpx2/j;->e:Lpx2/i;

    .line 8
    iput-object p6, p0, Lpx2/j;->f:Llx2/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lpx2/i;Llx2/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lpx2/j;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lpx2/i;Llx2/a;)V

    return-void
.end method


# virtual methods
.method public final a()Llx2/a;
    .locals 1

    iget-object v0, p0, Lpx2/j;->f:Llx2/a;

    return-object v0
.end method

.method public final b()Lpx2/i;
    .locals 1

    iget-object v0, p0, Lpx2/j;->e:Lpx2/i;

    return-object v0
.end method

.method public final c()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lpx2/j;->d:Lgz0/m0;

    return-object v0
.end method

.method public abstract d()Ly81/e;
.end method

.method public abstract e()Ly81/e;
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lpx2/j;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final g()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lpx2/j;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final h()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lpx2/j;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method
