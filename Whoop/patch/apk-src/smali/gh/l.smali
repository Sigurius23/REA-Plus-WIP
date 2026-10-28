.class public final Lgh/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lgh/m;

.field public F:I

.field public w:Lgh/m;

.field public x:Leh/g;

.field public y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgh/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lgh/l;->E:Lgh/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgh/l;->z:Ljava/lang/Object;

    iget p1, p0, Lgh/l;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgh/l;->F:I

    iget-object p1, p0, Lgh/l;->E:Lgh/m;

    invoke-virtual {p1, p0}, Lgh/m;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
