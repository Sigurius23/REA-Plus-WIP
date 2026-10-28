.class public final Lc6/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lc6/h;

.field public F:I

.field public w:Ljava/lang/Object;

.field public x:Lne3/e0;

.field public y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc6/h;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lc6/g;->E:Lc6/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lc6/g;->z:Ljava/lang/Object;

    iget p1, p0, Lc6/g;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lc6/g;->F:I

    iget-object p1, p0, Lc6/g;->E:Lc6/h;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lc6/h;->c(La6/h0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
