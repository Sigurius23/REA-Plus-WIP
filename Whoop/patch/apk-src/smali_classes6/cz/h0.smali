.class public final Lcz/h0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lcz/n0;

.field public F:I

.field public w:Lcz/n0;

.field public x:Ljava/lang/Object;

.field public y:Lh20/a;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcz/n0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lcz/h0;->E:Lcz/n0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcz/h0;->z:Ljava/lang/Object;

    iget p1, p0, Lcz/h0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcz/h0;->F:I

    iget-object p1, p0, Lcz/h0;->E:Lcz/n0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcz/n0;->p(Ly00/o4;Lh20/a;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
