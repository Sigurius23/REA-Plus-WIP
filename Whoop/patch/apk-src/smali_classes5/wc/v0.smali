.class public final Lwc/v0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lwc/q0;

.field public x:Ljava/io/Closeable;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lwc/x0;


# direct methods
.method public constructor <init>(Lwc/x0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwc/v0;->z:Lwc/x0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwc/v0;->y:Ljava/lang/Object;

    iget p1, p0, Lwc/v0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwc/v0;->E:I

    iget-object p1, p0, Lwc/v0;->z:Lwc/x0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lwc/x0;->d(Lwc/q0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
