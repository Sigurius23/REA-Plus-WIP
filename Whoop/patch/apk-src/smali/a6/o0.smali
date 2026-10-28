.class public final La6/o0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:La6/p0;

.field public F:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:La6/r0;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La6/p0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La6/o0;->E:La6/p0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La6/o0;->z:Ljava/lang/Object;

    iget p1, p0, La6/o0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La6/o0;->F:I

    iget-object p1, p0, La6/o0;->E:La6/p0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La6/p0;->c(La6/h0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
