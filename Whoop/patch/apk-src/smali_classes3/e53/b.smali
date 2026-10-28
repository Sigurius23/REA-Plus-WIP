.class public final Le53/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lqg3/d;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lqg3/d;

.field public z:I


# direct methods
.method public constructor <init>(Lqg3/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le53/b;->y:Lqg3/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le53/b;->x:Ljava/lang/Object;

    iget p1, p0, Le53/b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le53/b;->z:I

    iget-object p1, p0, Le53/b;->y:Lqg3/d;

    invoke-virtual {p1, p0}, Lqg3/d;->w(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
