.class public final La63/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:La63/o;

.field public y:I


# direct methods
.method public constructor <init>(La63/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La63/m;->x:La63/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La63/m;->w:Ljava/lang/Object;

    iget p1, p0, La63/m;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La63/m;->y:I

    iget-object p1, p0, La63/m;->x:La63/o;

    invoke-static {p1, p0}, La63/o;->a(La63/o;Ls83/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
