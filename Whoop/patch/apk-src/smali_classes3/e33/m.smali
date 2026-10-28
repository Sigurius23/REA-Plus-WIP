.class public final Le33/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Le33/n;

.field public y:I


# direct methods
.method public constructor <init>(Le33/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le33/m;->x:Le33/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le33/m;->w:Ljava/lang/Object;

    iget p1, p0, Le33/m;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le33/m;->y:I

    iget-object p1, p0, Le33/m;->x:Le33/n;

    invoke-virtual {p1, p0}, Le33/n;->x(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
