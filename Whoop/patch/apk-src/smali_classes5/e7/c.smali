.class public final Le7/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Le7/g;

.field public y:I


# direct methods
.method public constructor <init>(Le7/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le7/c;->x:Le7/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le7/c;->w:Ljava/lang/Object;

    iget p1, p0, Le7/c;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le7/c;->y:I

    iget-object p1, p0, Le7/c;->x:Le7/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Le7/g;->f(Lo7/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
