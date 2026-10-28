.class public final Lm63/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lm63/c;

.field public F:I

.field public w:Lm63/c;

.field public x:Ljava/nio/charset/Charset;

.field public y:Lwc3/c;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm63/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lm63/b;->E:Lm63/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm63/b;->z:Ljava/lang/Object;

    iget p1, p0, Lm63/b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm63/b;->F:I

    iget-object p1, p0, Lm63/b;->E:Lm63/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lm63/c;->b(Ljava/nio/charset/Charset;Ls63/a;Lio/ktor/utils/io/q;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
