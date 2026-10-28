.class public final La00/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:La00/g;

.field public F:I

.field public w:Ljava/lang/Object;

.field public x:Lwz/u0;

.field public y:Z

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La00/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La00/e;->E:La00/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La00/e;->z:Ljava/lang/Object;

    iget p1, p0, La00/e;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La00/e;->F:I

    iget-object p1, p0, La00/e;->E:La00/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, La00/g;->i(Lwz/n0;La00/f;Lwz/u0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
