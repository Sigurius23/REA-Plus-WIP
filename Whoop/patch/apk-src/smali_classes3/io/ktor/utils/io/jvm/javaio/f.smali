.class public final Lio/ktor/utils/io/jvm/javaio/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lio/ktor/utils/io/jvm/javaio/g;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lio/ktor/utils/io/jvm/javaio/g;

.field public z:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/jvm/javaio/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/jvm/javaio/f;->y:Lio/ktor/utils/io/jvm/javaio/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/ktor/utils/io/jvm/javaio/f;->x:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/jvm/javaio/f;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/jvm/javaio/f;->z:I

    iget-object p1, p0, Lio/ktor/utils/io/jvm/javaio/f;->y:Lio/ktor/utils/io/jvm/javaio/g;

    invoke-virtual {p1, p0}, Lio/ktor/utils/io/jvm/javaio/g;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
