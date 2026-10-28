.class public final Llb/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ljava/lang/String;

.field public x:Lkotlin/jvm/functions/Function1;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Llb/n;


# direct methods
.method public constructor <init>(Llb/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Llb/l;->z:Llb/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llb/l;->y:Ljava/lang/Object;

    iget p1, p0, Llb/l;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llb/l;->E:I

    iget-object p1, p0, Llb/l;->z:Llb/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Llb/n;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
