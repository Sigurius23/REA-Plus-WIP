.class public final Ll72/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll72/o;->N(Lj72/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "l72/o$a",
        "Lfy1/k;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "b",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "sage_release"
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
.field private final b:Lcom/whoop/metrics/common/ScreenState;


# direct methods
.method public constructor <init>(Lj72/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lj72/k;->a(Lj72/j;)Lcom/whoop/metrics/common/ScreenState;

    move-result-object p1

    iput-object p1, p0, Ll72/o$a;->b:Lcom/whoop/metrics/common/ScreenState;

    return-void
.end method


# virtual methods
.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    iget-object v0, p0, Ll72/o$a;->b:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method
