.class public final Lwc/k0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lwc/m0;

.field public F:I

.field public w:Lwd/g;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwc/m0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwc/k0;->E:Lwc/m0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwc/k0;->z:Ljava/lang/Object;

    iget p1, p0, Lwc/k0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwc/k0;->F:I

    iget-object p1, p0, Lwc/k0;->E:Lwc/m0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lwc/m0;->h(Lrv/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
