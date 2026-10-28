.class public final Lwn/e;
.super Lwn/h;
.source "SourceFile"


# instance fields
.field public final L:Z

.field public final M:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lwn/g;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZZZ)V
    .locals 0

    invoke-direct/range {p0 .. p15}, Lwn/h;-><init>(Ljava/lang/String;Lwn/g;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZ)V

    move/from16 p1, p16

    iput-boolean p1, p0, Lwn/e;->L:Z

    move/from16 p1, p17

    iput-boolean p1, p0, Lwn/e;->M:Z

    return-void
.end method
