.class public final synthetic Lmg1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FileFilter;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmg1/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lmg1/a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;)Z
    .locals 2

    iget-object v0, p0, Lmg1/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lmg1/a;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lmg1/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Z

    move-result p1

    return p1
.end method
