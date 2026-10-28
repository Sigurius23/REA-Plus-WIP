.class public abstract Lkp0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\u001b\u0008\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkp0/o;",
        "",
        "",
        "value",
        "Lcom/whoop/design/util/TextResource;",
        "textResource",
        "<init>",
        "(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;)V",
        "w",
        "Ljava/lang/Integer;",
        "f",
        "()Ljava/lang/Integer;",
        "x",
        "Lcom/whoop/design/util/TextResource;",
        "b",
        "()Lcom/whoop/design/util/TextResource;",
        "Lkp0/d;",
        "Lkp0/k;",
        "Lkp0/l;",
        "Lkp0/m;",
        "Lkp0/q;",
        "Lkp0/r;",
        "sleep-coach_release"
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
.field public static final y:I


# instance fields
.field private final w:Ljava/lang/Integer;

.field private final x:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lkp0/o;->y:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkp0/o;->w:Ljava/lang/Integer;

    iput-object p2, p0, Lkp0/o;->x:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkp0/o;-><init>(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;)V

    return-void
.end method


# virtual methods
.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lkp0/o;->x:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lkp0/o;->w:Ljava/lang/Integer;

    return-object v0
.end method
