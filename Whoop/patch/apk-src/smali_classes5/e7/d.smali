.class public final Le7/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Le7/g;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Le7/g;

.field public z:I


# direct methods
.method public constructor <init>(Le7/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le7/d;->y:Le7/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le7/d;->x:Ljava/lang/Object;

    iget p1, p0, Le7/d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le7/d;->z:I

    iget-object p1, p0, Le7/d;->y:Le7/g;

    invoke-virtual {p1, p0}, Le7/g;->d(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
