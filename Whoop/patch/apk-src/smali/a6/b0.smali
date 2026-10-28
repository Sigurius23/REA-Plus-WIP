.class public final La6/b0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Z

.field public x:La6/e1;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:La6/i0;


# direct methods
.method public constructor <init>(La6/i0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, La6/b0;->z:La6/i0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La6/b0;->y:Ljava/lang/Object;

    iget p1, p0, La6/b0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La6/b0;->E:I

    iget-object p1, p0, La6/b0;->z:La6/i0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, La6/i0;->f(La6/i0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
