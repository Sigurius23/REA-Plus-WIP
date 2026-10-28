.class public final Le7/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lm83/y;

.field public x:Ljava/util/List;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Le7/g;


# direct methods
.method public constructor <init>(Le7/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le7/a;->z:Le7/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le7/a;->y:Ljava/lang/Object;

    iget p1, p0, Le7/a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le7/a;->E:I

    iget-object p1, p0, Le7/a;->z:Le7/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Le7/g;->g(Lj93/d;Lm83/y;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
