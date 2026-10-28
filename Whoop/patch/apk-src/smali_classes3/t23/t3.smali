.class public final Lt23/t3;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lt23/b4;

.field public y:I


# direct methods
.method public constructor <init>(Lt23/b4;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/t3;->x:Lt23/b4;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iput-object v1, v0, Lt23/t3;->w:Ljava/lang/Object;

    iget v1, v0, Lt23/t3;->y:I

    const/high16 v2, -0x80000000

    or-int/2addr v1, v2

    iput v1, v0, Lt23/t3;->y:I

    const/4 v14, 0x0

    const/4 v15, 0x0

    iget-object v1, v0, Lt23/t3;->x:Lt23/b4;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v16, v0

    invoke-virtual/range {v1 .. v16}, Lt23/b4;->s(Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;Ljg3/i;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
