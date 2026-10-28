.class public final Lcom/whoop/community/presentation/teams/f;
.super Lrq0/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/presentation/teams/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001aB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000e\u001a\u0004\u0008\u000e\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/community/presentation/teams/f;",
        "Lrq0/o;",
        "<init>",
        "()V",
        "",
        "G",
        "()Ljava/lang/String;",
        "H",
        "Lrq0/z;",
        "state",
        "Ll83/a0;",
        "N",
        "(Lrq0/z;)V",
        "",
        "I",
        "K",
        "()I",
        "titleRes",
        "J",
        "nextButtonRes",
        "layoutRes",
        "Lrq0/w;",
        "Lrq0/w;",
        "getStep",
        "()Lrq0/w;",
        "step",
        "a",
        "community_release"
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
.field public static final K:Lcom/whoop/community/presentation/teams/f$a;

.field public static final L:I


# instance fields
.field private final G:I

.field private final H:I

.field private final I:I

.field private final J:Lrq0/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/community/presentation/teams/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/community/presentation/teams/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/community/presentation/teams/f;->K:Lcom/whoop/community/presentation/teams/f$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/community/presentation/teams/f;->L:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lrq0/o;-><init>()V

    sget v0, Lxp0/d0;->a2:I

    iput v0, p0, Lcom/whoop/community/presentation/teams/f;->G:I

    sget v0, Lxp0/d0;->V1:I

    iput v0, p0, Lcom/whoop/community/presentation/teams/f;->H:I

    sget v0, Lxp0/b0;->S:I

    iput v0, p0, Lcom/whoop/community/presentation/teams/f;->I:I

    sget-object v0, Lrq0/w;->SPLASH:Lrq0/w;

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/f;->J:Lrq0/w;

    return-void
.end method


# virtual methods
.method public G()Ljava/lang/String;
    .locals 1

    const-string v0, "Start"

    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/presentation/teams/f;->I:I

    return v0
.end method

.method public J()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/presentation/teams/f;->H:I

    return v0
.end method

.method public K()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/presentation/teams/f;->G:I

    return v0
.end method

.method public N(Lrq0/z;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lrq0/o;->P(Z)V

    return-void
.end method
