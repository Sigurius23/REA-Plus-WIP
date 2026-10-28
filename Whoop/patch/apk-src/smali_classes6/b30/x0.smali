.class public final Lb30/x0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lb30/y0;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lb30/y0;

.field public z:I


# direct methods
.method public constructor <init>(Lb30/y0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lb30/x0;->y:Lb30/y0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lb30/x0;->x:Ljava/lang/Object;

    iget p1, p0, Lb30/x0;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lb30/x0;->z:I

    iget-object p1, p0, Lb30/x0;->y:Lb30/y0;

    invoke-static {p1, p0}, Lb30/y0;->a(Lb30/y0;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
