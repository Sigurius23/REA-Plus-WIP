.class public final Lg43/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Landroid/support/v4/media/session/p;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lg43/e;

.field public z:I


# direct methods
.method public constructor <init>(Lg43/e;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lg43/d;->y:Lg43/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg43/d;->x:Ljava/lang/Object;

    iget p1, p0, Lg43/d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg43/d;->z:I

    iget-object p1, p0, Lg43/d;->y:Lg43/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lg43/e;->d(Lg43/e;Landroid/support/v4/media/session/p;Lt23/c0;Landroid/support/v4/media/session/s;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
