.class public abstract Lu92/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/database/sqlite/SQLiteDatabase;

.field private b:Lu92/g;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lu92/g;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu92/a;->b:Lu92/g;

    iput-object p2, p0, Lu92/a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    iget-object v0, p0, Lu92/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    iget-object v0, p0, Lu92/a;->b:Lu92/g;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lu92/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, v0}, Lu92/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_0
    iget-object v0, p0, Lu92/a;->a:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method public abstract b(Landroid/database/sqlite/SQLiteDatabase;)V
.end method
