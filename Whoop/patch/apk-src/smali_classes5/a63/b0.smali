.class public final La63/b0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:La63/c0;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:La63/c0;

.field public z:I


# direct methods
.method public constructor <init>(La63/c0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La63/b0;->y:La63/c0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La63/b0;->x:Ljava/lang/Object;

    iget p1, p0, La63/b0;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La63/b0;->z:I

    iget-object p1, p0, La63/b0;->y:La63/c0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La63/c0;->a(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
