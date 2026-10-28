.class public final Lr6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/y0;


# static fields
.field public static final a:Lr6/z;

.field public static final b:Lr6/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr6/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr6/z;->a:Lr6/z;

    invoke-static {}, Lr6/s;->q()Lr6/s;

    move-result-object v0

    const-string v1, "getDefaultInstance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lr6/z;->b:Lr6/s;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr6/z;->b:Lr6/s;

    return-object v0
.end method

.method public final b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 2

    :try_start_0
    invoke-static {p1}, Lr6/s;->t(Ljava/io/InputStream;)Lr6/s;

    move-result-object p1
    :try_end_0
    .catch Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/datastore/core/CorruptionException;

    const-string v1, "Cannot read proto."

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Lr6/s;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroidx/glance/appwidget/protobuf/a0;->b(Landroidx/glance/appwidget/protobuf/b1;)I

    move-result v0

    sget-object v1, Landroidx/glance/appwidget/protobuf/p;->e:Ljava/util/logging/Logger;

    const/16 v1, 0x1000

    if-le v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Landroidx/glance/appwidget/protobuf/o;

    invoke-direct {v1, p1, v0}, Landroidx/glance/appwidget/protobuf/o;-><init>(Ljava/io/OutputStream;I)V

    invoke-virtual {p2, v1}, Landroidx/glance/appwidget/protobuf/a0;->m(Landroidx/glance/appwidget/protobuf/p;)V

    iget p1, v1, Landroidx/glance/appwidget/protobuf/o;->i:I

    if-lez p1, :cond_1

    invoke-virtual {v1}, Landroidx/glance/appwidget/protobuf/o;->H0()V

    :cond_1
    return-void
.end method
