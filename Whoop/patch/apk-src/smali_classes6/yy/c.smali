.class public abstract Lyy/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile g:Ljava/util/UUID;

.field public static final h:Ljava/lang/String;

.field public static final i:Lux/f0;


# instance fields
.field public final a:Landroid/content/pm/PackageManager;

.field public final b:Landroid/content/pm/PackageInfo;

.field public final c:Ljava/lang/String;

.field public final d:Lk83/a;

.field public final e:Lk83/a;

.field public final f:Lk83/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    const-string v1, "randomUUID(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lyy/c;->g:Ljava/util/UUID;

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lyy/c;->h:Ljava/lang/String;

    new-instance v0, Lux/f0;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lux/f0;-><init>(I)V

    sput-object v0, Lyy/c;->i:Lux/f0;

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Lk83/a;Lk83/a;)V
    .locals 2

    const-string v0, "pluginTypeProvider"

    sget-object v1, Lyy/c;->i:Lux/f0;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyy/c;->a:Landroid/content/pm/PackageManager;

    iput-object p2, p0, Lyy/c;->b:Landroid/content/pm/PackageInfo;

    iput-object p3, p0, Lyy/c;->c:Ljava/lang/String;

    iput-object p4, p0, Lyy/c;->d:Lk83/a;

    iput-object p5, p0, Lyy/c;->e:Lk83/a;

    iput-object v1, p0, Lyy/c;->f:Lk83/a;

    return-void
.end method


# virtual methods
.method public abstract a(Lyy/a;Ljava/util/Map;)Lyy/b;
.end method
