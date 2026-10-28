.class public final Lo23/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lo23/c;

.field public F:I

.field public w:Lo23/c;

.field public x:Lc93/m;

.field public y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo23/c;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lo23/b;->E:Lo23/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo23/b;->z:Ljava/lang/Object;

    iget p1, p0, Lo23/b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo23/b;->F:I

    iget-object p1, p0, Lo23/b;->E:Lo23/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lo23/c;->a(Lc93/m;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
