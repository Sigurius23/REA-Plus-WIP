.class public final Lwc/h;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ljava/lang/String;

.field public x:Lcg/o;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lwc/i;


# direct methods
.method public constructor <init>(Lwc/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwc/h;->z:Lwc/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwc/h;->y:Ljava/lang/Object;

    iget p1, p0, Lwc/h;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwc/h;->E:I

    iget-object p1, p0, Lwc/h;->z:Lwc/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lwc/i;->k(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
