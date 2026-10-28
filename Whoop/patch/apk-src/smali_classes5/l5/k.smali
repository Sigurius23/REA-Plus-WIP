.class public final Ll5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RemoteViewsService$RemoteViewsFactory;


# static fields
.field public static final e:Le73/b;


# instance fields
.field public final a:Landroidx/core/widget/RemoteViewsCompatService;

.field public final b:I

.field public final c:I

.field public d:Le73/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Le73/b;

    const/4 v1, 0x0

    new-array v2, v1, [J

    new-array v1, v1, [Landroid/widget/RemoteViews;

    invoke-direct {v0, v2, v1}, Le73/b;-><init>([J[Landroid/widget/RemoteViews;)V

    sput-object v0, Ll5/k;->e:Le73/b;

    return-void
.end method

.method public constructor <init>(Landroidx/core/widget/RemoteViewsCompatService;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll5/k;->a:Landroidx/core/widget/RemoteViewsCompatService;

    iput p2, p0, Ll5/k;->b:I

    iput p3, p0, Ll5/k;->c:I

    sget-object p1, Ll5/k;->e:Le73/b;

    iput-object p1, p0, Ll5/k;->d:Le73/b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    const-string v0, "bytes"

    iget-object v1, p0, Ll5/k;->a:Landroidx/core/widget/RemoteViewsCompatService;

    const-string v2, "androidx.core.widget.prefs.RemoteViewsCompat"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v4, "context.getSharedPrefere\u2026S_FILENAME, MODE_PRIVATE)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget v5, p0, Ll5/k;->b:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v6, 0x3a

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v6, p0, Ll5/k;->c:I

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    invoke-interface {v2, v4, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "RemoteViewsCompatServic"

    if-nez v2, :cond_0

    const-string v0, "No collection items were stored for widget "

    invoke-static {v5, v0, v4}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_0
    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    const-string v7, "decode(hexString, Base64.DEFAULT)"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v7

    const-string v8, "obtain()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    array-length v9, v2

    invoke-virtual {v7, v2, v3, v9}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v7, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    new-instance v2, Ll5/j;

    invoke-direct {v2, v7}, Ll5/j;-><init>(Landroid/os/Parcel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    sget-object v7, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    iget-object v9, v2, Ll5/j;->b:Ljava/lang/String;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    const-string v0, "Android version code has changed, not using stored collection items for widget "

    invoke-static {v5, v0, v4}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v1}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v7

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Couldn\'t retrieve version code for "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v1, v6

    :goto_0
    if-nez v1, :cond_2

    const-string v0, "Couldn\'t get version code, not using stored collection items for widget "

    invoke-static {v5, v0, v4}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-wide v9, v2, Ll5/j;->c:J

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    cmp-long v1, v11, v9

    if-eqz v1, :cond_3

    const-string v0, "App version code has changed, not using stored collection items for widget "

    invoke-static {v5, v0, v4}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    :try_start_2
    iget-object v1, v2, Ll5/j;->a:[B

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    array-length v2, v1

    invoke-virtual {v0, v1, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    new-instance v1, Le73/b;

    invoke-direct {v1, v0}, Le73/b;-><init>(Landroid/os/Parcel;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    move-object v6, v1

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to deserialize stored collection items for widget "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    if-nez v6, :cond_4

    sget-object v6, Ll5/k;->e:Le73/b;

    :cond_4
    iput-object v6, p0, Ll5/k;->d:Le73/b;

    return-void

    :catchall_2
    move-exception v0

    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    throw v0
.end method

.method public final getCount()I
    .locals 1

    iget-object v0, p0, Ll5/k;->d:Le73/b;

    iget-object v0, v0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, [J

    array-length v0, v0

    return v0
.end method

.method public final getItemId(I)J
    .locals 2

    :try_start_0
    iget-object v0, p0, Ll5/k;->d:Le73/b;

    iget-object v0, v0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, [J

    aget-wide v0, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final bridge synthetic getLoadingView()Landroid/widget/RemoteViews;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewAt(I)Landroid/widget/RemoteViews;
    .locals 2

    :try_start_0
    iget-object v0, p0, Ll5/k;->d:Le73/b;

    iget-object v0, v0, Le73/b;->c:Ljava/lang/Object;

    check-cast v0, [Landroid/widget/RemoteViews;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Landroid/widget/RemoteViews;

    iget-object v0, p0, Ll5/k;->a:Landroidx/core/widget/RemoteViewsCompatService;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0d02e4

    invoke-direct {p1, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    return-object p1
.end method

.method public final getViewTypeCount()I
    .locals 1

    iget-object v0, p0, Ll5/k;->d:Le73/b;

    iget v0, v0, Le73/b;->d:I

    return v0
.end method

.method public final hasStableIds()Z
    .locals 1

    iget-object v0, p0, Ll5/k;->d:Le73/b;

    iget-boolean v0, v0, Le73/b;->b:Z

    return v0
.end method

.method public final onCreate()V
    .locals 0

    invoke-virtual {p0}, Ll5/k;->a()V

    return-void
.end method

.method public final onDataSetChanged()V
    .locals 0

    invoke-virtual {p0}, Ll5/k;->a()V

    return-void
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
