.class public final Lff/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lme/b;

.field public H:I

.field public w:Log/g;

.field public x:[Ljava/lang/Object;

.field public y:Lff/a;

.field public z:I


# direct methods
.method public constructor <init>(Lme/b;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lff/b;->G:Lme/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lff/b;->F:Ljava/lang/Object;

    iget p1, p0, Lff/b;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lff/b;->H:I

    iget-object p1, p0, Lff/b;->G:Lme/b;

    invoke-static {p1, p0}, Lme/b;->h(Lme/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
