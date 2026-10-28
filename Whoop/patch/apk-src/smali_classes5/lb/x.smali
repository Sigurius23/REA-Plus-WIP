.class public final Llb/x;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Z

.field public x:Llb/h;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Llb/a0;


# direct methods
.method public constructor <init>(Llb/a0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Llb/x;->z:Llb/a0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llb/x;->y:Ljava/lang/Object;

    iget p1, p0, Llb/x;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llb/x;->E:I

    iget-object p1, p0, Llb/x;->z:Llb/a0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Llb/a0;->f(ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
