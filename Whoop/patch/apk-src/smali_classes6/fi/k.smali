.class public abstract Lfi/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf93/a;

.field public static final b:Lf93/a;

.field public static final c:Lf93/a;

.field public static final d:Lf93/a;

.field public static final e:Lf93/a;

.field public static final f:Lf93/a;

.field public static final g:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf93/a;

    sget-object v1, Lji/d;->a:Lji/b;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/k;->a:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Lki/l;->b:Landroid/graphics/Bitmap$Config;

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/k;->b:Lf93/a;

    new-instance v0, Lf93/a;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/k;->c:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/k;->d:Lf93/a;

    new-instance v0, Lf93/a;

    invoke-direct {v0, v2, v3}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/k;->e:Lf93/a;

    new-instance v0, Lf93/a;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/k;->f:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/k;->g:Lf93/a;

    return-void
.end method

.method public static final a(Lfi/o;)Landroid/graphics/Bitmap$Config;
    .locals 1

    sget-object v0, Lfi/k;->b:Lf93/a;

    invoke-static {p0, v0}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap$Config;

    return-object p0
.end method

.method public static final b(Lfi/o;)Landroid/graphics/ColorSpace;
    .locals 1

    sget-object v0, Lfi/k;->c:Lf93/a;

    invoke-static {p0, v0}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/ColorSpace;

    return-object p0
.end method
