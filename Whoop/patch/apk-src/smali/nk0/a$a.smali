.class public abstract Lnk0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnk0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\n0\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lnk0/a$a;",
        "Ljava/lang/Runnable;",
        "Llt0/c;",
        "blePacket",
        "Lst0/v;",
        "strapGen",
        "<init>",
        "(Llt0/c;Lst0/v;)V",
        "",
        "sequenceNumber",
        "Ll83/a0;",
        "d",
        "(B)V",
        "Lkotlin/Function1;",
        "action",
        "c",
        "(Lkotlin/jvm/functions/Function1;)V",
        "w",
        "Llt0/c;",
        "a",
        "()Llt0/c;",
        "x",
        "Lst0/v;",
        "b",
        "()Lst0/v;",
        "Lg83/d;",
        "y",
        "Lg83/d;",
        "notificationPubSub",
        "connectivity_release"
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
.field private final w:Llt0/c;

.field private final x:Lst0/v;

.field private final y:Lg83/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg83/d;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llt0/c;Lst0/v;)V
    .locals 1

    const-string v0, "blePacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapGen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnk0/a$a;->w:Llt0/c;

    iput-object p2, p0, Lnk0/a$a;->x:Lst0/v;

    new-instance p1, Lg83/d;

    invoke-direct {p1}, Lg83/d;-><init>()V

    iput-object p1, p0, Lnk0/a$a;->y:Lg83/d;

    return-void
.end method


# virtual methods
.method public final a()Llt0/c;
    .locals 1

    iget-object v0, p0, Lnk0/a$a;->w:Llt0/c;

    return-object v0
.end method

.method public final b()Lst0/v;
    .locals 1

    iget-object v0, p0, Lnk0/a$a;->x:Lst0/v;

    return-object v0
.end method

.method public final c(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnk0/a$a;->y:Lg83/d;

    new-instance v1, Lnk0/a$a$a;

    invoke-direct {v1, p1}, Lnk0/a$a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Ll73/c;->c(Ll73/d;)V

    return-void
.end method

.method public final d(B)V
    .locals 1

    iget-object v0, p0, Lnk0/a$a;->w:Llt0/c;

    invoke-virtual {v0, p1}, Llt0/c;->P(B)V

    iget-object v0, p0, Lnk0/a$a;->y:Lg83/d;

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg83/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method
