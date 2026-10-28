.class public final Lwc/l0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lwc/m0;

.field public F:I

.field public w:Lwd/m;

.field public x:Lwc/a1;

.field public y:Ljava/lang/String;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwc/m0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwc/l0;->E:Lwc/m0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwc/l0;->z:Ljava/lang/Object;

    iget p1, p0, Lwc/l0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwc/l0;->F:I

    iget-object p1, p0, Lwc/l0;->E:Lwc/m0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lwc/m0;->i(Lwd/m;Lve/e;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
