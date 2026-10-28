.class public final Lwc/n0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lwc/p0;

.field public y:I


# direct methods
.method public constructor <init>(Lwc/p0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwc/n0;->x:Lwc/p0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwc/n0;->w:Ljava/lang/Object;

    iget p1, p0, Lwc/n0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwc/n0;->y:I

    iget-object p1, p0, Lwc/n0;->x:Lwc/p0;

    invoke-virtual {p1, p0}, Lwc/p0;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
