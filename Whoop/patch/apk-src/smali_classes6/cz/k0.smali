.class public final Lcz/k0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lcz/n0;

.field public x:Ly00/o4;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lcz/n0;


# direct methods
.method public constructor <init>(Lcz/n0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lcz/k0;->z:Lcz/n0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcz/k0;->y:Ljava/lang/Object;

    iget p1, p0, Lcz/k0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcz/k0;->E:I

    iget-object p1, p0, Lcz/k0;->z:Lcz/n0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcz/n0;->r(Ly00/o4;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
