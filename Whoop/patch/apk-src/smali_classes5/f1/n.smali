.class public final Lf1/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lf1/p;

.field public G:I

.field public w:Ljava/lang/CharSequence;

.field public x:Ljava/lang/Object;

.field public y:Lmc3/c;

.field public z:J


# direct methods
.method public constructor <init>(Lf1/p;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lf1/n;->F:Lf1/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lf1/n;->E:Ljava/lang/Object;

    iget p1, p0, Lf1/n;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf1/n;->G:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lf1/n;->F:Lf1/p;

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lf1/p;->a(Lf1/p;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
