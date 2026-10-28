.class public final La63/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lf63/c;

.field public x:Ljava/util/Iterator;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:La63/o;


# direct methods
.method public constructor <init>(La63/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La63/n;->z:La63/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La63/n;->y:Ljava/lang/Object;

    iget p1, p0, La63/n;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La63/n;->E:I

    iget-object p1, p0, La63/n;->z:La63/o;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, La63/o;->b(La63/o;Lf63/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
