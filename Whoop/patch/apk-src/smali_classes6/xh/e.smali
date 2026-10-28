.class public final Lxh/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lxh/k;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lxh/f;

.field public z:I


# direct methods
.method public constructor <init>(Lxh/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxh/e;->y:Lxh/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxh/e;->x:Ljava/lang/Object;

    iget p1, p0, Lxh/e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxh/e;->z:I

    iget-object p1, p0, Lxh/e;->y:Lxh/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lxh/f;->intercept(Lxh/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
