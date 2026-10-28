.class public final Lbd3/b0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lbd3/c0;

.field public H:I

.field public w:Ll83/b;

.field public x:Lbd3/c0;

.field public y:Ljava/util/LinkedHashMap;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbd3/c0;Ls83/a;)V
    .locals 0

    iput-object p1, p0, Lbd3/b0;->G:Lbd3/c0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbd3/b0;->F:Ljava/lang/Object;

    iget p1, p0, Lbd3/b0;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbd3/b0;->H:I

    iget-object p1, p0, Lbd3/b0;->G:Lbd3/c0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lbd3/c0;->a(Lbd3/c0;Ll83/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
