.class public final Ltd/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Luf/w;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lrd/a;

.field public z:I


# direct methods
.method public constructor <init>(Lrd/a;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ltd/a;->y:Lrd/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ltd/a;->x:Ljava/lang/Object;

    iget p1, p0, Ltd/a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ltd/a;->z:I

    iget-object p1, p0, Ltd/a;->y:Lrd/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lrd/a;->c(Luf/w;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
